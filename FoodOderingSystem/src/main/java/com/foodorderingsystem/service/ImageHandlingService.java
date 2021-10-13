package com.foodorderingsystem.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@Service
public class ImageHandlingService {
	
	String DOWNLOAD_URL = "https://firebasestorage.googleapis.com/v0/b/foodorderingsystem-97f5a.appspot.com/o/%s?alt=media";

	private String uploadFile(File file, String fileName) throws IOException {
        BlobId blobId = BlobId.of("foodorderingsystem-97f5a.appspot.com", fileName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("media").build();
        Credentials credentials = GoogleCredentials.fromStream(new FileInputStream("/Users/poojapatil/Downloads/FoodOderingSystem/SecurityFile/foodorderingsystem-97f5a-firebase-adminsdk-qsmt3-144e40be6b.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
        storage.create(blobInfo, Files.readAllBytes(file.toPath()));
        return String.format(DOWNLOAD_URL, URLEncoder.encode(fileName, StandardCharsets.UTF_8));
    }

    private File convertToFile(MultipartFile multipartFile, String fileName) throws IOException {
        File tempFile = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(multipartFile.getBytes());
            fos.close();
        }
        return tempFile;
    }

    private String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }
    
    public String upload(MultipartFile multipartFile) {
    	String result = null;
    	Map<String,String> response = new HashMap<String,String>();
        try {
            String fileName = multipartFile.getOriginalFilename();                        
            fileName = UUID.randomUUID().toString().concat(this.getExtension(fileName));   

            File file = this.convertToFile(multipartFile, fileName);                     
            String TEMP_URL = this.uploadFile(file, fileName);                                   

            result  = TEMP_URL;
        } catch (Exception e) {
            e.printStackTrace();
            response.put("Error","");
        }
        return result;
    }
    
    public Map<String,String> download(String fileName) throws IOException {
    	Map<String,String> response = new HashMap<String,String>();
        String destFileName = UUID.randomUUID().toString().concat(this.getExtension(fileName));     
        String destFilePath = "Z:\\New folder\\" + destFileName;                                    
        
        Credentials credentials = GoogleCredentials.fromStream(new FileInputStream("/Users/poojapatil/Downloads/FoodOderingSystem/SecurityFile/foodorderingsystem-97f5a-firebase-adminsdk-qsmt3-144e40be6b.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
        Blob blob = storage.get(BlobId.of("foodorderingsystem-97f5a.appspot.com", fileName));
        blob.downloadTo(Paths.get(destFilePath));
        response.put("200", "Successfully Downloaded!");
        return response;
    }
    
    public static void main(String[] args) {
	}
}
