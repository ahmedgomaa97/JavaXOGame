/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Utils.JsonAction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author A H M E D
 */
public class Responce {

    public static Responce fromJson(String body) throws  JsonProcessingException{
        return new ObjectMapper().readValue(body, Responce.class);
    }
    
    public String toJson() throws  JsonProcessingException{
        return new ObjectMapper().writeValueAsString(this);
    }
    
    public static String arrayToString(ArrayList array) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        final ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        mapper.writeValue(out2,  array);
        final byte[] data = out2.toByteArray();
        return new String(data);
    }
    
    public void sendJson(DataOutputStream out) throws JsonProcessingException, IOException{
        out.writeUTF(this.toJson());
    }
    
     public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Responce{" + "statusCode=" + statusCode + ", object=" + object + '}';
    }
   
    public Responce() {
    }

    public Responce(int statusCode, String object) {
        this.statusCode = statusCode;
        this.object = object;
    }
    
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    private int statusCode;
    private String object;

}