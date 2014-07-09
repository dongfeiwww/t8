
package org.apache.t8;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Tinyurl data schema
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.PegasusDataTemplateGenerator", comments = "LinkedIn Data Template. Generated from /Users/fdong/code/t8/t8-api/src/main/pegasus/org/apache/t8/Tinyurl.pdsc.", date = "Wed Jul 09 13:28:21 PDT 2014")
public class Tinyurl
    extends RecordTemplate
{

    private final static Tinyurl.Fields _fields = new Tinyurl.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Tinyurl\",\"namespace\":\"org.apache.t8\",\"doc\":\"Tinyurl data schema\",\"fields\":[{\"name\":\"shortURL\",\"type\":\"string\",\"doc\":\"A URL after shorten\"},{\"name\":\"origURL\",\"type\":\"string\",\"doc\":\"Original URL\"},{\"name\":\"message\",\"type\":\"string\",\"doc\":\"Description\"}]}"));
    private final static RecordDataSchema.Field FIELD_ShortURL = SCHEMA.getField("shortURL");
    private final static RecordDataSchema.Field FIELD_OrigURL = SCHEMA.getField("origURL");
    private final static RecordDataSchema.Field FIELD_Message = SCHEMA.getField("message");

    public Tinyurl() {
        super(new DataMap(), SCHEMA);
    }

    public Tinyurl(DataMap data) {
        super(data, SCHEMA);
    }

    public static Tinyurl.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for shortURL
     * 
     * @see Fields#shortURL
     */
    public boolean hasShortURL() {
        return contains(FIELD_ShortURL);
    }

    /**
     * Remover for shortURL
     * 
     * @see Fields#shortURL
     */
    public void removeShortURL() {
        remove(FIELD_ShortURL);
    }

    /**
     * Getter for shortURL
     * 
     * @see Fields#shortURL
     */
    public String getShortURL(GetMode mode) {
        return obtainDirect(FIELD_ShortURL, String.class, mode);
    }

    /**
     * Getter for shortURL
     * 
     * @see Fields#shortURL
     */
    public String getShortURL() {
        return getShortURL(GetMode.STRICT);
    }

    /**
     * Setter for shortURL
     * 
     * @see Fields#shortURL
     */
    public Tinyurl setShortURL(String value, SetMode mode) {
        putDirect(FIELD_ShortURL, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for shortURL
     * 
     * @see Fields#shortURL
     */
    public Tinyurl setShortURL(String value) {
        putDirect(FIELD_ShortURL, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origURL
     * 
     * @see Fields#origURL
     */
    public boolean hasOrigURL() {
        return contains(FIELD_OrigURL);
    }

    /**
     * Remover for origURL
     * 
     * @see Fields#origURL
     */
    public void removeOrigURL() {
        remove(FIELD_OrigURL);
    }

    /**
     * Getter for origURL
     * 
     * @see Fields#origURL
     */
    public String getOrigURL(GetMode mode) {
        return obtainDirect(FIELD_OrigURL, String.class, mode);
    }

    /**
     * Getter for origURL
     * 
     * @see Fields#origURL
     */
    public String getOrigURL() {
        return getOrigURL(GetMode.STRICT);
    }

    /**
     * Setter for origURL
     * 
     * @see Fields#origURL
     */
    public Tinyurl setOrigURL(String value, SetMode mode) {
        putDirect(FIELD_OrigURL, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origURL
     * 
     * @see Fields#origURL
     */
    public Tinyurl setOrigURL(String value) {
        putDirect(FIELD_OrigURL, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for message
     * 
     * @see Fields#message
     */
    public boolean hasMessage() {
        return contains(FIELD_Message);
    }

    /**
     * Remover for message
     * 
     * @see Fields#message
     */
    public void removeMessage() {
        remove(FIELD_Message);
    }

    /**
     * Getter for message
     * 
     * @see Fields#message
     */
    public String getMessage(GetMode mode) {
        return obtainDirect(FIELD_Message, String.class, mode);
    }

    /**
     * Getter for message
     * 
     * @see Fields#message
     */
    public String getMessage() {
        return getMessage(GetMode.STRICT);
    }

    /**
     * Setter for message
     * 
     * @see Fields#message
     */
    public Tinyurl setMessage(String value, SetMode mode) {
        putDirect(FIELD_Message, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for message
     * 
     * @see Fields#message
     */
    public Tinyurl setMessage(String value) {
        putDirect(FIELD_Message, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Tinyurl clone()
        throws CloneNotSupportedException
    {
        return ((Tinyurl) super.clone());
    }

    @Override
    public Tinyurl copy()
        throws CloneNotSupportedException
    {
        return ((Tinyurl) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * A URL after shorten
         * 
         */
        public PathSpec shortURL() {
            return new PathSpec(getPathComponents(), "shortURL");
        }

        /**
         * Original URL
         * 
         */
        public PathSpec origURL() {
            return new PathSpec(getPathComponents(), "origURL");
        }

        /**
         * Description
         * 
         */
        public PathSpec message() {
            return new PathSpec(getPathComponents(), "message");
        }

    }

}
