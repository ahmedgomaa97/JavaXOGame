/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.User;
import Entities.UserGameDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A H M E D
 */


public interface ICrud<T>{
    public int add(T entity)throws JsonProcessingException, IOException;
    public int update(String id,T entity)throws JsonProcessingException, IOException;
    public int delete(String id)throws JsonProcessingException, IOException;
    public T get(String id)throws JsonProcessingException, IOException;
    public ArrayList<T> getAll()throws JsonProcessingException, IOException;
} 


