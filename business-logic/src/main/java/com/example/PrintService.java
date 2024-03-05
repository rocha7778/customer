/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.example;

public class PrintService{

    public void printMessage(MessageModel model){

        String message = model.getMessage();
        System.out.println(message);
        

    }

}