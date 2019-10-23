/**
 * JananiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.janani;

public interface JananiService extends javax.xml.rpc.Service {
    public java.lang.String getJananiAddress();

    public com.janani.Janani getJanani() throws javax.xml.rpc.ServiceException;

    public com.janani.Janani getJanani(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
