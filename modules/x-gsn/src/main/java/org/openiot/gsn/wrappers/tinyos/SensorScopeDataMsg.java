/**
*    Copyright (c) 2011-2014, OpenIoT
*   
*    This file is part of OpenIoT.
*
*    OpenIoT is free software: you can redistribute it and/or modify
*    it under the terms of the GNU Lesser General Public License as published by
*    the Free Software Foundation, version 3 of the License.
*
*    OpenIoT is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU Lesser General Public License for more details.
*
*    You should have received a copy of the GNU Lesser General Public License
*    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
*
*     Contact: OpenIoT mailto: info@openiot.eu
*/

package org.openiot.gsn.wrappers.tinyos;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'SensorScopeDataMsg'
 * message type.
 */

public class SensorScopeDataMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 20;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 27;

    /** Create a new SensorScopeDataMsg of size 20. */
    public SensorScopeDataMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new SensorScopeDataMsg of the given data_length. */
    public SensorScopeDataMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg with the given data_length
     * and base offset.
     */
    public SensorScopeDataMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg using the given byte array
     * as backing store.
     */
    public SensorScopeDataMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public SensorScopeDataMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public SensorScopeDataMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg embedded in the given message
     * at the given base offset.
     */
    public SensorScopeDataMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SensorScopeDataMsg embedded in the given message
     * at the given base offset and length.
     */
    public SensorScopeDataMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <SensorScopeDataMsg> \n";
      try {
        s += "  [nodeid=0x"+Long.toHexString(get_nodeid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rainmeter=0x"+Long.toHexString(get_rainmeter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [watermark=0x"+Long.toHexString(get_watermark())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [soilmoisture=0x"+Long.toHexString(get_soilmoisture())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [solarradiation=0x"+Long.toHexString(get_solarradiation())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [winddirection=0x"+Long.toHexString(get_winddirection())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [windspeed=0x"+Long.toHexString(get_windspeed())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [temperature=0x"+Long.toHexString(get_temperature())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [humidity=0x"+Long.toHexString(get_humidity())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [infraredtmp=0x"+Long.toHexString(get_infraredtmp())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeid
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeid' is signed (false).
     */
    public static boolean isSigned_nodeid() {
        return false;
    }

    /**
     * Return whether the field 'nodeid' is an array (false).
     */
    public static boolean isArray_nodeid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeid'
     */
    public static int offset_nodeid() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeid'
     */
    public static int offsetBits_nodeid() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'nodeid'
     */
    public short get_nodeid() {
        return (short)getUIntBEElement(offsetBits_nodeid(), 8);
    }

    /**
     * Set the value of the field 'nodeid'
     */
    public void set_nodeid(short value) {
        setUIntBEElement(offsetBits_nodeid(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeid'
     */
    public static int size_nodeid() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeid'
     */
    public static int sizeBits_nodeid() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rainmeter
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rainmeter' is signed (false).
     */
    public static boolean isSigned_rainmeter() {
        return false;
    }

    /**
     * Return whether the field 'rainmeter' is an array (false).
     */
    public static boolean isArray_rainmeter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rainmeter'
     */
    public static int offset_rainmeter() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rainmeter'
     */
    public static int offsetBits_rainmeter() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'rainmeter'
     */
    public short get_rainmeter() {
        return (short)getUIntBEElement(offsetBits_rainmeter(), 8);
    }

    /**
     * Set the value of the field 'rainmeter'
     */
    public void set_rainmeter(short value) {
        setUIntBEElement(offsetBits_rainmeter(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'rainmeter'
     */
    public static int size_rainmeter() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rainmeter'
     */
    public static int sizeBits_rainmeter() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'counter'
     */
    public int get_counter() {
        return (int)getUIntBEElement(offsetBits_counter(), 16);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(int value) {
        setUIntBEElement(offsetBits_counter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: watermark
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'watermark' is signed (false).
     */
    public static boolean isSigned_watermark() {
        return false;
    }

    /**
     * Return whether the field 'watermark' is an array (false).
     */
    public static boolean isArray_watermark() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'watermark'
     */
    public static int offset_watermark() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'watermark'
     */
    public static int offsetBits_watermark() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'watermark'
     */
    public int get_watermark() {
        return (int)getUIntBEElement(offsetBits_watermark(), 16);
    }

    /**
     * Set the value of the field 'watermark'
     */
    public void set_watermark(int value) {
        setUIntBEElement(offsetBits_watermark(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'watermark'
     */
    public static int size_watermark() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'watermark'
     */
    public static int sizeBits_watermark() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: soilmoisture
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'soilmoisture' is signed (false).
     */
    public static boolean isSigned_soilmoisture() {
        return false;
    }

    /**
     * Return whether the field 'soilmoisture' is an array (false).
     */
    public static boolean isArray_soilmoisture() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'soilmoisture'
     */
    public static int offset_soilmoisture() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'soilmoisture'
     */
    public static int offsetBits_soilmoisture() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'soilmoisture'
     */
    public int get_soilmoisture() {
        return (int)getUIntBEElement(offsetBits_soilmoisture(), 16);
    }

    /**
     * Set the value of the field 'soilmoisture'
     */
    public void set_soilmoisture(int value) {
        setUIntBEElement(offsetBits_soilmoisture(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'soilmoisture'
     */
    public static int size_soilmoisture() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'soilmoisture'
     */
    public static int sizeBits_soilmoisture() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: solarradiation
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'solarradiation' is signed (false).
     */
    public static boolean isSigned_solarradiation() {
        return false;
    }

    /**
     * Return whether the field 'solarradiation' is an array (false).
     */
    public static boolean isArray_solarradiation() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'solarradiation'
     */
    public static int offset_solarradiation() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'solarradiation'
     */
    public static int offsetBits_solarradiation() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'solarradiation'
     */
    public int get_solarradiation() {
        return (int)getUIntBEElement(offsetBits_solarradiation(), 16);
    }

    /**
     * Set the value of the field 'solarradiation'
     */
    public void set_solarradiation(int value) {
        setUIntBEElement(offsetBits_solarradiation(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'solarradiation'
     */
    public static int size_solarradiation() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'solarradiation'
     */
    public static int sizeBits_solarradiation() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: winddirection
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'winddirection' is signed (false).
     */
    public static boolean isSigned_winddirection() {
        return false;
    }

    /**
     * Return whether the field 'winddirection' is an array (false).
     */
    public static boolean isArray_winddirection() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'winddirection'
     */
    public static int offset_winddirection() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'winddirection'
     */
    public static int offsetBits_winddirection() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'winddirection'
     */
    public int get_winddirection() {
        return (int)getUIntBEElement(offsetBits_winddirection(), 16);
    }

    /**
     * Set the value of the field 'winddirection'
     */
    public void set_winddirection(int value) {
        setUIntBEElement(offsetBits_winddirection(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'winddirection'
     */
    public static int size_winddirection() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'winddirection'
     */
    public static int sizeBits_winddirection() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: windspeed
    //   Field type: int, unsigned
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'windspeed' is signed (false).
     */
    public static boolean isSigned_windspeed() {
        return false;
    }

    /**
     * Return whether the field 'windspeed' is an array (false).
     */
    public static boolean isArray_windspeed() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'windspeed'
     */
    public static int offset_windspeed() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'windspeed'
     */
    public static int offsetBits_windspeed() {
        return 96;
    }

    /**
     * Return the value (as a int) of the field 'windspeed'
     */
    public int get_windspeed() {
        return (int)getUIntBEElement(offsetBits_windspeed(), 16);
    }

    /**
     * Set the value of the field 'windspeed'
     */
    public void set_windspeed(int value) {
        setUIntBEElement(offsetBits_windspeed(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'windspeed'
     */
    public static int size_windspeed() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'windspeed'
     */
    public static int sizeBits_windspeed() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: temperature
    //   Field type: int, unsigned
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'temperature' is signed (false).
     */
    public static boolean isSigned_temperature() {
        return false;
    }

    /**
     * Return whether the field 'temperature' is an array (false).
     */
    public static boolean isArray_temperature() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'temperature'
     */
    public static int offset_temperature() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'temperature'
     */
    public static int offsetBits_temperature() {
        return 112;
    }

    /**
     * Return the value (as a int) of the field 'temperature'
     */
    public int get_temperature() {
        return (int)getUIntBEElement(offsetBits_temperature(), 16);
    }

    /**
     * Set the value of the field 'temperature'
     */
    public void set_temperature(int value) {
        setUIntBEElement(offsetBits_temperature(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'temperature'
     */
    public static int size_temperature() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'temperature'
     */
    public static int sizeBits_temperature() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: humidity
    //   Field type: int, unsigned
    //   Offset (bits): 128
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'humidity' is signed (false).
     */
    public static boolean isSigned_humidity() {
        return false;
    }

    /**
     * Return whether the field 'humidity' is an array (false).
     */
    public static boolean isArray_humidity() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'humidity'
     */
    public static int offset_humidity() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'humidity'
     */
    public static int offsetBits_humidity() {
        return 128;
    }

    /**
     * Return the value (as a int) of the field 'humidity'
     */
    public int get_humidity() {
        return (int)getUIntBEElement(offsetBits_humidity(), 16);
    }

    /**
     * Set the value of the field 'humidity'
     */
    public void set_humidity(int value) {
        setUIntBEElement(offsetBits_humidity(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'humidity'
     */
    public static int size_humidity() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'humidity'
     */
    public static int sizeBits_humidity() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: infraredtmp
    //   Field type: int, unsigned
    //   Offset (bits): 144
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'infraredtmp' is signed (false).
     */
    public static boolean isSigned_infraredtmp() {
        return false;
    }

    /**
     * Return whether the field 'infraredtmp' is an array (false).
     */
    public static boolean isArray_infraredtmp() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'infraredtmp'
     */
    public static int offset_infraredtmp() {
        return (144 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'infraredtmp'
     */
    public static int offsetBits_infraredtmp() {
        return 144;
    }

    /**
     * Return the value (as a int) of the field 'infraredtmp'
     */
    public int get_infraredtmp() {
        return (int)getUIntBEElement(offsetBits_infraredtmp(), 16);
    }

    /**
     * Set the value of the field 'infraredtmp'
     */
    public void set_infraredtmp(int value) {
        setUIntBEElement(offsetBits_infraredtmp(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'infraredtmp'
     */
    public static int size_infraredtmp() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'infraredtmp'
     */
    public static int sizeBits_infraredtmp() {
        return 16;
    }

}
