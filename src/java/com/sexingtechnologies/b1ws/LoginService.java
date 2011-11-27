package com.sexingtechnologies.b1ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2011-11-17T14:21:41.067-06:00
 * Generated source version: 2.5.0
 * 
 */
@WebServiceClient(name = "LoginService", 
                  wsdlLocation = "http://10.1.1.65/B1WS/WebReferences/LoginService.wsdl",
                  targetNamespace = "LoginService") 
public class LoginService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("LoginService", "LoginService");
    public final static QName LoginServiceSoap = new QName("LoginService", "LoginServiceSoap");
    public final static QName LoginServiceSoap12 = new QName("LoginService", "LoginServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://10.1.1.65/B1WS/WebReferences/LoginService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoginService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.1.1.65/B1WS/WebReferences/LoginService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoginService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns LoginServiceSoap
     */
    @WebEndpoint(name = "LoginServiceSoap")
    public LoginServiceSoap getLoginServiceSoap() {
        return super.getPort(LoginServiceSoap, LoginServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginServiceSoap
     */
    @WebEndpoint(name = "LoginServiceSoap")
    public LoginServiceSoap getLoginServiceSoap(WebServiceFeature... features) {
        return super.getPort(LoginServiceSoap, LoginServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns LoginServiceSoap
     */
    @WebEndpoint(name = "LoginServiceSoap12")
    public LoginServiceSoap getLoginServiceSoap12() {
        return super.getPort(LoginServiceSoap12, LoginServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginServiceSoap
     */
    @WebEndpoint(name = "LoginServiceSoap12")
    public LoginServiceSoap getLoginServiceSoap12(WebServiceFeature... features) {
        return super.getPort(LoginServiceSoap12, LoginServiceSoap.class, features);
    }

}
