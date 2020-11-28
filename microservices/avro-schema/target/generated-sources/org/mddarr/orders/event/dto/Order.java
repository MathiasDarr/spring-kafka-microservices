/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mddarr.orders.event.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1771105373564108894L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"org.mddarr.orders.event.dto\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"customerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"OrderState\",\"symbols\":[\"PENDING\",\"VALIDATED\",\"OUT_OF_STOCK\",\"STOCKED\",\"FAILED\",\"SHIPPED\"]}},{\"name\":\"productID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"quantity\",\"type\":\"long\"},{\"name\":\"price\",\"type\":\"double\"},{\"name\":\"order_time\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Order to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Order from a ByteBuffer. */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String id;
   private java.lang.String customerId;
   private org.mddarr.orders.event.dto.OrderState state;
   private java.lang.String productID;
   private long quantity;
   private double price;
   private org.joda.time.DateTime order_time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param customerId The new value for customerId
   * @param state The new value for state
   * @param productID The new value for productID
   * @param quantity The new value for quantity
   * @param price The new value for price
   * @param order_time The new value for order_time
   */
  public Order(java.lang.String id, java.lang.String customerId, org.mddarr.orders.event.dto.OrderState state, java.lang.String productID, java.lang.Long quantity, java.lang.Double price, org.joda.time.DateTime order_time) {
    this.id = id;
    this.customerId = customerId;
    this.state = state;
    this.productID = productID;
    this.quantity = quantity;
    this.price = price;
    this.order_time = order_time;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return customerId;
    case 2: return state;
    case 3: return productID;
    case 4: return quantity;
    case 5: return price;
    case 6: return order_time;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      TIMESTAMP_CONVERSION,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: customerId = (java.lang.String)value$; break;
    case 2: state = (org.mddarr.orders.event.dto.OrderState)value$; break;
    case 3: productID = (java.lang.String)value$; break;
    case 4: quantity = (java.lang.Long)value$; break;
    case 5: price = (java.lang.Double)value$; break;
    case 6: order_time = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.String value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public org.mddarr.orders.event.dto.OrderState getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(org.mddarr.orders.event.dto.OrderState value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'productID' field.
   * @return The value of the 'productID' field.
   */
  public java.lang.String getProductID() {
    return productID;
  }

  /**
   * Sets the value of the 'productID' field.
   * @param value the value to set.
   */
  public void setProductID(java.lang.String value) {
    this.productID = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Long value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.Double getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.Double value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'order_time' field.
   * @return The value of the 'order_time' field.
   */
  public org.joda.time.DateTime getOrderTime() {
    return order_time;
  }

  /**
   * Sets the value of the 'order_time' field.
   * @param value the value to set.
   */
  public void setOrderTime(org.joda.time.DateTime value) {
    this.order_time = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static org.mddarr.orders.event.dto.Order.Builder newBuilder() {
    return new org.mddarr.orders.event.dto.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static org.mddarr.orders.event.dto.Order.Builder newBuilder(org.mddarr.orders.event.dto.Order.Builder other) {
    return new org.mddarr.orders.event.dto.Order.Builder(other);
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static org.mddarr.orders.event.dto.Order.Builder newBuilder(org.mddarr.orders.event.dto.Order other) {
    return new org.mddarr.orders.event.dto.Order.Builder(other);
  }

  /**
   * RecordBuilder for Order instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.String id;
    private java.lang.String customerId;
    private org.mddarr.orders.event.dto.OrderState state;
    private java.lang.String productID;
    private long quantity;
    private double price;
    private org.joda.time.DateTime order_time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mddarr.orders.event.dto.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.productID)) {
        this.productID = data().deepCopy(fields()[3].schema(), other.productID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.order_time)) {
        this.order_time = data().deepCopy(fields()[6].schema(), other.order_time);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mddarr.orders.event.dto.Order other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.productID)) {
        this.productID = data().deepCopy(fields()[3].schema(), other.productID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.order_time)) {
        this.order_time = data().deepCopy(fields()[6].schema(), other.order_time);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public java.lang.String getCustomerId() {
      return customerId;
    }

    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setCustomerId(java.lang.String value) {
      validate(fields()[1], value);
      this.customerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearCustomerId() {
      customerId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public org.mddarr.orders.event.dto.OrderState getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setState(org.mddarr.orders.event.dto.OrderState value) {
      validate(fields()[2], value);
      this.state = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'productID' field.
      * @return The value.
      */
    public java.lang.String getProductID() {
      return productID;
    }

    /**
      * Sets the value of the 'productID' field.
      * @param value The value of 'productID'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setProductID(java.lang.String value) {
      validate(fields()[3], value);
      this.productID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'productID' field has been set.
      * @return True if the 'productID' field has been set, false otherwise.
      */
    public boolean hasProductID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'productID' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearProductID() {
      productID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.Long getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setQuantity(long value) {
      validate(fields()[4], value);
      this.quantity = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearQuantity() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.Double getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setPrice(double value) {
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'order_time' field.
      * @return The value.
      */
    public org.joda.time.DateTime getOrderTime() {
      return order_time;
    }

    /**
      * Sets the value of the 'order_time' field.
      * @param value The value of 'order_time'.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder setOrderTime(org.joda.time.DateTime value) {
      validate(fields()[6], value);
      this.order_time = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'order_time' field has been set.
      * @return True if the 'order_time' field has been set, false otherwise.
      */
    public boolean hasOrderTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'order_time' field.
      * @return This builder.
      */
    public org.mddarr.orders.event.dto.Order.Builder clearOrderTime() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0], record.getConversion(0));
        record.customerId = fieldSetFlags()[1] ? this.customerId : (java.lang.String) defaultValue(fields()[1], record.getConversion(1));
        record.state = fieldSetFlags()[2] ? this.state : (org.mddarr.orders.event.dto.OrderState) defaultValue(fields()[2], record.getConversion(2));
        record.productID = fieldSetFlags()[3] ? this.productID : (java.lang.String) defaultValue(fields()[3], record.getConversion(3));
        record.quantity = fieldSetFlags()[4] ? this.quantity : (java.lang.Long) defaultValue(fields()[4], record.getConversion(4));
        record.price = fieldSetFlags()[5] ? this.price : (java.lang.Double) defaultValue(fields()[5], record.getConversion(5));
        record.order_time = fieldSetFlags()[6] ? this.order_time : (org.joda.time.DateTime) defaultValue(fields()[6], record.getConversion(6));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
