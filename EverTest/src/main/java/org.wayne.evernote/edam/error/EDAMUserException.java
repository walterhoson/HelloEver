/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.error;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

/**
 * This exception is thrown by EDAM procedures when a call fails as a result of
 * a problem that a caller may be able to resolve.  For example, if the user
 * attempts to add a note to their account which would exceed their storage
 * quota, this type of exception may be thrown to indicate the source of the
 * error so that they can choose an alternate action.
 * 
 * This exception would not be used for internal system errors that do not
 * reflect user actions, but rather reflect a problem within the service that
 * the user cannot resolve.
 * 
 * errorCode:  The numeric code indicating the type of error that occurred.
 *   must be one of the values of EDAMErrorCode.
 * 
 * parameter:  If the error applied to a particular input parameter, this will
 *   indicate which parameter.
 */
public class EDAMUserException extends Exception implements TBase<EDAMUserException>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("EDAMUserException");

  private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)1);
  private static final TField PARAMETER_FIELD_DESC = new TField("parameter", TType.STRING, (short)2);

  private EDAMErrorCode errorCode;
  private String parameter;


  // isset id assignments

  public EDAMUserException() {
  }

  public EDAMUserException(
    EDAMErrorCode errorCode)
  {
    this();
    this.errorCode = errorCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EDAMUserException(EDAMUserException other) {
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
    if (other.isSetParameter()) {
      this.parameter = other.parameter;
    }
  }

  public EDAMUserException deepCopy() {
    return new EDAMUserException(this);
  }

  public void clear() {
    this.errorCode = null;
    this.parameter = null;
  }

  /**
   * 
   * @see EDAMErrorCode
   */
  public EDAMErrorCode getErrorCode() {
    return this.errorCode;
  }

  /**
   * 
   * @see EDAMErrorCode
   */
  public void setErrorCode(EDAMErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been asigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
  }

  public String getParameter() {
    return this.parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public void unsetParameter() {
    this.parameter = null;
  }

  /** Returns true if field parameter is set (has been asigned a value) and false otherwise */
  public boolean isSetParameter() {
    return this.parameter != null;
  }

  public void setParameterIsSet(boolean value) {
    if (!value) {
      this.parameter = null;
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EDAMUserException)
      return this.equals((EDAMUserException)that);
    return false;
  }

  public boolean equals(EDAMUserException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    boolean this_present_parameter = true && this.isSetParameter();
    boolean that_present_parameter = true && that.isSetParameter();
    if (this_present_parameter || that_present_parameter) {
      if (!(this_present_parameter && that_present_parameter))
        return false;
      if (!this.parameter.equals(that.parameter))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(EDAMUserException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    EDAMUserException typedOther = (EDAMUserException)other;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(typedOther.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {      lastComparison = TBaseHelper.compareTo(this.errorCode, typedOther.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameter()).compareTo(typedOther.isSetParameter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameter()) {      lastComparison = TBaseHelper.compareTo(this.parameter, typedOther.parameter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ERROR_CODE
          if (field.type == TType.I32) {
            this.errorCode = EDAMErrorCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PARAMETER
          if (field.type == TType.STRING) {
            this.parameter = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.errorCode != null) {
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(this.errorCode.getValue());
      oprot.writeFieldEnd();
    }
    if (this.parameter != null) {
      if (isSetParameter()) {
        oprot.writeFieldBegin(PARAMETER_FIELD_DESC);
        oprot.writeString(this.parameter);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EDAMUserException(");
    boolean first = true;

    sb.append("errorCode:");
    if (this.errorCode == null) {
      sb.append("null");
    } else {
      sb.append(this.errorCode);
    }
    first = false;
    if (isSetParameter()) {
      if (!first) sb.append(", ");
      sb.append("parameter:");
      if (this.parameter == null) {
        sb.append("null");
      } else {
        sb.append(this.parameter);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!isSetErrorCode()) {
      throw new TProtocolException("Required field 'errorCode' is unset! Struct:" + toString());
    }

  }

}

