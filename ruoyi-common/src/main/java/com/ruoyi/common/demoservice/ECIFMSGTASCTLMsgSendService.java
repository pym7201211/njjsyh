
package com.ruoyi.common.demoservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ECIFMSGTAS_CTL_MsgSendService", targetNamespace = "http://www.jscb.com.cn/ecifmsg/ECIFMSGTAS_CTL_MsgSend/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ECIFMSGTASCTLMsgSendService {


    /**
     * 
     * @param tasCTLMsgSendRequest
     * @return
     *     returns TASCTLMsgSendResponse
     */
    @WebMethod(operationName = "TAS_CTL_MsgSend", action = "http://www.jscb.com.cn/ecifmsg/ECIFMSGTAS_CTL_MsgSend/TAS_CTL_MsgSend")
    @WebResult(name = "TAS_CTL_MsgSendResponse", targetNamespace = "http://www.jscb.com.cn/ecifmsg/ECIFMSGTAS_CTL_MsgSend/", partName = "TAS_CTL_MsgSendResponse")
    public TASCTLMsgSendResponse tasCTLMsgSend(

            @WebParam(name = "TAS_CTL_MsgSendRequest", targetNamespace = "http://www.jscb.com.cn/ecifmsg/ECIFMSGTAS_CTL_MsgSend/", partName = "TAS_CTL_MsgSendRequest")
                    TASCTLMsgSendRequest tasCTLMsgSendRequest);

}
