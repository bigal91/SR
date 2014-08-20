
/**
 * ServiceRegistryServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package de.stutt.ba.serviceregistry.serviceregistry;

        /**
        *  ServiceRegistryServiceMessageReceiverInOut message receiver
        */

        public class ServiceRegistryServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServiceRegistryServiceSkeleton skel = (ServiceRegistryServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("searchByProvider".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService56 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService56 =
                                                   
                                                   
                                                         skel.searchByProvider(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService56, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByProvider"));
                                    } else 

            if("registerUser".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource58 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource58 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource58, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "registerUser"));
                                    } else 

            if("searchByServiceConfiguration".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService60 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService60 =
                                                   
                                                   
                                                         skel.searchByServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService60, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByServiceConfiguration"));
                                    } else 

            if("createNotProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource62 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource62 =
                                                   
                                                   
                                                         skel.createNotProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource62, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createNotProvisionedService"));
                                    } else 

            if("loginUser".equals(methodName)){
                
                java.lang.String string64 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               string64 =
                                                   
                                                   
                                                         skel.loginUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), string64, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "loginUser"));
                                    } else 

            if("createServiceConfiguration".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource66 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource66 =
                                                   
                                                   
                                                         skel.createServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource66, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createServiceConfiguration"));
                                    } else 

            if("createProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource68 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource68 =
                                                   
                                                   
                                                         skel.createProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource68, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createProvisionedService"));
                                    } else 

            if("searchByQualifiedPortTypeName".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService70 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService70 =
                                                   
                                                   
                                                         skel.searchByQualifiedPortTypeName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService70, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByQualifiedPortTypeName"));
                                    } else 

            if("editNotProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource72 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource72 =
                                                   
                                                   
                                                         skel.editNotProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource72, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "editNotProvisionedService"));
                                    } else 

            if("deleteService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource74 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.LongResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.LongResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource74 =
                                                   
                                                   
                                                         skel.deleteService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource74, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "deleteService"));
                                    } else 

            if("editProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource76 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource76 =
                                                   
                                                   
                                                         skel.editProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource76, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "editProvisionedService"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(java.lang.String param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(java.lang.String.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.AbstractService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.AbstractService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.LongResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LongResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.AbstractService param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.AbstractService.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByProvider(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.BooleanResource param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapregisterUser(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByServiceConfiguration(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.LongResource param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LongResource.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateNotProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, java.lang.String param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(java.lang.String.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private java.lang.String wraploginUser(){
                                java.lang.String wrappedElement = new java.lang.String();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateServiceConfiguration(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByQualifiedPortTypeName(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapeditNotProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapdeleteService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapeditProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    