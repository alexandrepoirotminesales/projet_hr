package com.hr.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class User {
    
    @Getter @Setter
    int id; 

    @Getter @Setter
    String nom; 

    @Getter @Setter
    String prenom; 

}
