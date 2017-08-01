/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.service.impl;

/**
 *
 * @author Dilshan
 */
public class ServiceFactoryImpl {
    
    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws Exception {
    }

    public static ServiceFactory getInstance() throws Exception {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }
    
}
