package srimobile.aspen.leidos.com.sri.data;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1String;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.UniversalTag;


@ASN1PreparedElement
@ASN1Sequence(name = "DriverVehicleInformationData", isSet = false)
public class DriverVehicleInformationData implements IASN1PreparedElement {

    private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DriverVehicleInformationData.class);
    @ASN1String(name = "",
            stringType = UniversalTag.UTF8String, isUCS = false)

    @ASN1Element(name = "driversLicenseNumber", isOptional = false, hasTag = true, tag = 0, hasDefaultValue = false)

    private String driversLicenseNumber = null;
    @ASN1String(name = "",
            stringType = UniversalTag.UTF8String, isUCS = false)

    @ASN1Element(name = "cdlNumber", isOptional = false, hasTag = true, tag = 1, hasDefaultValue = false)

    private String cdlNumber = null;
    @ASN1String(name = "",
            stringType = UniversalTag.UTF8String, isUCS = false)

    @ASN1Element(name = "vin", isOptional = false, hasTag = true, tag = 2, hasDefaultValue = false)

    private String vin = null;
    @ASN1String(name = "",
            stringType = UniversalTag.UTF8String, isUCS = false)

    @ASN1Element(name = "usdotNumber", isOptional = false, hasTag = true, tag = 3, hasDefaultValue = false)

    private String usdotNumber = null;
    @ASN1String(name = "",
            stringType = UniversalTag.UTF8String, isUCS = false)

    @ASN1Element(name = "plateNumber", isOptional = false, hasTag = true, tag = 4, hasDefaultValue = false)

    private String plateNumber = null;

    public String getDriversLicenseNumber() {
        return this.driversLicenseNumber;
    }

    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

    public String getCdlNumber() {
        return this.cdlNumber;
    }

    public void setCdlNumber(String value) {
        this.cdlNumber = value;
    }

    public String getVin() {
        return this.vin;
    }

    public void setVin(String value) {
        this.vin = value;
    }

    public String getUsdotNumber() {
        return this.usdotNumber;
    }

    public void setUsdotNumber(String value) {
        this.usdotNumber = value;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    public void initWithDefaults() {

    }

    public IASN1PreparedElementData getPreparedData() {
        return preparedData;
    }


}
            