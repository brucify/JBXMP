package samples;

import java.util.Calendar;

import com.adobe.xmp.XMPDateTime;
import com.adobe.xmp.XMPException;
import com.adobe.xmp.XMPIterator;
import com.adobe.xmp.XMPMeta;
import com.adobe.xmp.options.IteratorOptions;
import com.adobe.xmp.options.ParseOptions;
import com.adobe.xmp.options.PropertyOptions;
import com.adobe.xmp.properties.XMPProperty;

public class CCMeta implements XMPMeta {

	@Override
	public XMPProperty getProperty(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPProperty getArrayItem(String schemaNS, String arrayName,
			int itemIndex) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countArrayItems(String schemaNS, String arrayName)
			throws XMPException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public XMPProperty getStructField(String schemaNS, String structName,
			String fieldNS, String fieldName) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPProperty getQualifier(String schemaNS, String propName,
			String qualNS, String qualName) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String schemaNS, String propName, Object propValue,
			PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProperty(String schemaNS, String propName, Object propValue)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setArrayItem(String schemaNS, String arrayName, int itemIndex,
			String itemValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setArrayItem(String schemaNS, String arrayName, int itemIndex,
			String itemValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertArrayItem(String schemaNS, String arrayName,
			int itemIndex, String itemValue, PropertyOptions options)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertArrayItem(String schemaNS, String arrayName,
			int itemIndex, String itemValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendArrayItem(String schemaNS, String arrayName,
			PropertyOptions arrayOptions, String itemValue,
			PropertyOptions itemOptions) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendArrayItem(String schemaNS, String arrayName,
			String itemValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStructField(String schemaNS, String structName,
			String fieldNS, String fieldName, String fieldValue,
			PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStructField(String schemaNS, String structName,
			String fieldNS, String fieldName, String fieldValue)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setQualifier(String schemaNS, String propName, String qualNS,
			String qualName, String qualValue, PropertyOptions options)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setQualifier(String schemaNS, String propName, String qualNS,
			String qualName, String qualValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProperty(String schemaNS, String propName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArrayItem(String schemaNS, String arrayName, int itemIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStructField(String schemaNS, String structName,
			String fieldNS, String fieldName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQualifier(String schemaNS, String propName,
			String qualNS, String qualName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean doesPropertyExist(String schemaNS, String propName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesArrayItemExist(String schemaNS, String arrayName,
			int itemIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesStructFieldExist(String schemaNS, String structName,
			String fieldNS, String fieldName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesQualifierExist(String schemaNS, String propName,
			String qualNS, String qualName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public XMPProperty getLocalizedText(String schemaNS, String altTextName,
			String genericLang, String specificLang) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocalizedText(String schemaNS, String altTextName,
			String genericLang, String specificLang, String itemValue,
			PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLocalizedText(String schemaNS, String altTextName,
			String genericLang, String specificLang, String itemValue)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getPropertyBoolean(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getPropertyInteger(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getPropertyLong(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPropertyDouble(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPDateTime getPropertyDate(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calendar getPropertyCalendar(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getPropertyBase64(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPropertyString(String schemaNS, String propName)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPropertyBoolean(String schemaNS, String propName,
			boolean propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyBoolean(String schemaNS, String propName,
			boolean propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyInteger(String schemaNS, String propName,
			int propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyInteger(String schemaNS, String propName,
			int propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyLong(String schemaNS, String propName,
			long propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyLong(String schemaNS, String propName, long propValue)
			throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyDouble(String schemaNS, String propName,
			double propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyDouble(String schemaNS, String propName,
			double propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyDate(String schemaNS, String propName,
			XMPDateTime propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyDate(String schemaNS, String propName,
			XMPDateTime propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyCalendar(String schemaNS, String propName,
			Calendar propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyCalendar(String schemaNS, String propName,
			Calendar propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyBase64(String schemaNS, String propName,
			byte[] propValue, PropertyOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyBase64(String schemaNS, String propName,
			byte[] propValue) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMPIterator iterator() throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPIterator iterator(IteratorOptions options) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPIterator iterator(String schemaNS, String propName,
			IteratorOptions options) throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getObjectName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setObjectName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPacketHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object clone() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void normalize(ParseOptions options) throws XMPException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dumpObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
