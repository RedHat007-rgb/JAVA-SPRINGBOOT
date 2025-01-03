/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.javaspringboot.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author basanireddy
 */
@Component
public class ApplicationcONFIGURATION {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
