<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ns0="http://xmlns.westarenergy.com/EBM/CreateItem/V1.0"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tns="http://xmlns.westarenergy.com/Common/Logging/V1.0"
                exclude-result-prefixes="xsd xsi oracle-xsl-mapper xsl ns0 tns oraxsl xp20 xref mhdr oraext dvm socket"
                xmlns:ns2="http://schemas.xmlsoap.org/ws/2003/03/addressing"
                xmlns:ns3="http://xmlns.westarenergy.com/core/CommonTypes/V1.0"
                xmlns:ns6="http://xmlns.westarenergy.com/WSDL/MX_CreateItem_ABCS_req/V1.0/types"
                xmlns:ns5="http://xmlns.westarenergy.com/EBO/Item/V1.0"
                xmlns:fault="http://xmlns.westarenergy.com/Faults/CommonFaults/V1.0"
                xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
                xmlns:ns4="http://xmlns.westarenergy.com/EBM/CommonEBMHeader/V1.0"
                xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                xmlns:ns1="http://xmlns.westarenergy.com/WSDL/MX_CreateItem_ABCS_req/V1.0"
                xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"
                xmlns:bpws="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:plnk="http://docs.oasis-open.org/wsbpel/2.0/plnktype"
                xmlns:ns7="http://xmlns.westarenergy.com/Common/Errors/V1.0"
                xmlns:ns8="http://xmlns.westarenergy.com/WSDL/Item_EBS/V1.0">
  <oracle-xsl-mapper:schema>
    <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
    <oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:source type="WSDL">
        <oracle-xsl-mapper:schema location="oramds:/apps/WestarEnergy/ABCS/wsdl/MX_CreateItem_ABCS_req.wsdl"/>
        <oracle-xsl-mapper:rootElement name="CreateItemRequest"
                                       namespace="http://xmlns.westarenergy.com/EBM/CreateItem/V1.0"/>
      </oracle-xsl-mapper:source>
    </oracle-xsl-mapper:mapSources>
    <oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:target type="WSDL">
        <oracle-xsl-mapper:schema location="../WSDLs/MX_CreateItem_ABCS_reqWrapper.wsdl"/>
        <oracle-xsl-mapper:rootElement name="LogEvent" namespace="http://xmlns.westarenergy.com/Common/Logging/V1.0"/>
      </oracle-xsl-mapper:target>
    </oracle-xsl-mapper:mapTargets>
    <!--GENERATED BY ORACLE XSL MAPPER 12.1.3.0.0(XSLT Build 140529.0700.0211) AT [FRI NOV 20 12:39:47 CST 2015].-->
  </oracle-xsl-mapper:schema>
  <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
  <xsl:template match="/">
    <tns:LogEvent>
      <tns:LogInstanceID>
        <xsl:value-of select="oraext:generate-guid ( )"/>
      </tns:LogInstanceID>
      <tns:RequesterApplicationInformation>
        <ns3:Name>
          <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns4:Sender/ns4:Application"/>
        </ns3:Name>
        <ns3:InstanceID>
          <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns4:Sender/ns4:SenderMessageID"/>
        </ns3:InstanceID>
        <xsl:if test="/ns0:CreateItemRequest/ns0:EBMHeader/ns4:CreationDateTime">
          <ns3:Timestamp>
            <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns4:CreationDateTime"/>
          </ns3:Timestamp>
        </xsl:if>
      </tns:RequesterApplicationInformation>
      <tns:Payload>
        <ns3:Payload/>
        <xsl:copy-of select="/ns0:CreateItemRequest"/>
        <ns3:Type>CreateItemRequestType</ns3:Type>
      </tns:Payload>
      <tns:LogCreationDate>
        <xsl:value-of select="xp20:current-dateTime ( )"/>
      </tns:LogCreationDate>
      <tns:Errors>
        <ns7:Error>
          <ns7:CreationDate>
            <xsl:value-of select="xp20:current-dateTime ( )"/>
          </ns7:CreationDate>
        </ns7:Error>
      </tns:Errors>
    </tns:LogEvent>
  </xsl:template>
</xsl:stylesheet>