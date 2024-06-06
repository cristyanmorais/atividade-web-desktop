/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package top.dribles.frontend.model;

import java.util.List;

/**
 *
 * @author crist
 */
public class ApiException {
    private List<String> errorList;
    
    public List<String> getErrorList() {
        return errorList;
    }
    
    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
}
