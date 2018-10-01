/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.userstore;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

import java.util.ArrayList;
import java.util.List;

/**
 *  This structure describes a collection of bootstrap profiles.
 * <dl>
 *  <dt>profiles:</dt>
 *    <dd>
 *    List of one or more bootstrap profiles, in descending
 *    preference order.
 *    </dd>
 *  </dl>
 */
public class BootstrapInfo implements TBase<BootstrapInfo>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("BootstrapInfo");

  private static final TField PROFILES_FIELD_DESC = new TField("profiles", TType.LIST, (short)1);

  private List<BootstrapProfile> profiles;


  // isset id assignments

  public BootstrapInfo() {
  }

  public BootstrapInfo(
    List<BootstrapProfile> profiles)
  {
    this();
    this.profiles = profiles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BootstrapInfo(BootstrapInfo other) {
    if (other.isSetProfiles()) {
      List<BootstrapProfile> __this__profiles = new ArrayList<BootstrapProfile>();
      for (BootstrapProfile other_element : other.profiles) {
        __this__profiles.add(new BootstrapProfile(other_element));
      }
      this.profiles = __this__profiles;
    }
  }

  public BootstrapInfo deepCopy() {
    return new BootstrapInfo(this);
  }

  public void clear() {
    this.profiles = null;
  }

  public int getProfilesSize() {
    return (this.profiles == null) ? 0 : this.profiles.size();
  }

  public java.util.Iterator<BootstrapProfile> getProfilesIterator() {
    return (this.profiles == null) ? null : this.profiles.iterator();
  }

  public void addToProfiles(BootstrapProfile elem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<BootstrapProfile>();
    }
    this.profiles.add(elem);
  }

  public List<BootstrapProfile> getProfiles() {
    return this.profiles;
  }

  public void setProfiles(List<BootstrapProfile> profiles) {
    this.profiles = profiles;
  }

  public void unsetProfiles() {
    this.profiles = null;
  }

  /** Returns true if field profiles is set (has been asigned a value) and false otherwise */
  public boolean isSetProfiles() {
    return this.profiles != null;
  }

  public void setProfilesIsSet(boolean value) {
    if (!value) {
      this.profiles = null;
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BootstrapInfo)
      return this.equals((BootstrapInfo)that);
    return false;
  }

  public boolean equals(BootstrapInfo that) {
    if (that == null)
      return false;

    boolean this_present_profiles = true && this.isSetProfiles();
    boolean that_present_profiles = true && that.isSetProfiles();
    if (this_present_profiles || that_present_profiles) {
      if (!(this_present_profiles && that_present_profiles))
        return false;
      if (!this.profiles.equals(that.profiles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BootstrapInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BootstrapInfo typedOther = (BootstrapInfo)other;

    lastComparison = Boolean.valueOf(isSetProfiles()).compareTo(typedOther.isSetProfiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfiles()) {      lastComparison = TBaseHelper.compareTo(this.profiles, typedOther.profiles);
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
        case 1: // PROFILES
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.profiles = new ArrayList<BootstrapProfile>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                BootstrapProfile _elem2;
                _elem2 = new BootstrapProfile();
                _elem2.read(iprot);
                this.profiles.add(_elem2);
              }
              iprot.readListEnd();
            }
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
    if (this.profiles != null) {
      oprot.writeFieldBegin(PROFILES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.profiles.size()));
        for (BootstrapProfile _iter3 : this.profiles)
        {
          _iter3.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BootstrapInfo(");
    boolean first = true;

    sb.append("profiles:");
    if (this.profiles == null) {
      sb.append("null");
    } else {
      sb.append(this.profiles);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!isSetProfiles()) {
      throw new TProtocolException("Required field 'profiles' is unset! Struct:" + toString());
    }

  }

}

