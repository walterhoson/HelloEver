/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.notestore;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

import java.util.ArrayList;
import java.util.List;

/**
 *  A list of criteria that are used to indicate which notes are desired from
 *  the account.  This is used in queries to the NoteStore to determine
 *  which notes should be retrieved.
 * 
 * <dl>
 *  <dt>order</dt>
 *    <dd>
 *    The NoteSortOrder value indicating what criterion should be
 *    used to sort the results of the filter.
 *    </dd>
 * 
 *  <dt>ascending</dt>
 *    <dd>
 *    If true, the results will be ascending in the requested
 *    sort order.  If false, the results will be descending.
 *    </dd>
 * 
 *  <dt>words</dt>
 *    <dd>
 *    If present, a search query string that will filter the set of notes to be returned.
 *    Accepts the full search grammar documented in the Evernote API Overview.
 *    </dd>
 * 
 *  <dt>notebookGuid</dt>
 *    <dd>
 *    If present, the Guid of the notebook that must contain
 *    the notes.
 *    </dd>
 * 
 *  <dt>tagGuids</dt>
 *    <dd>
 *    If present, the list of tags (by GUID) that must be present
 *    on the notes.
 *    </dd>
 * 
 *  <dt>timeZone</dt>
 *    <dd>
 *    The zone ID for the user, which will be used to interpret
 *    any dates or times in the queries that do not include their desired zone
 *    information.
 *    For example, if a query requests notes created "yesterday", this
 *    will be evaluated from the provided time zone, if provided.
 *    The format must be encoded as a standard zone ID such as
 *    "America/Los_Angeles".
 *    </dd>
 * 
 *  <dt>inactive</dt>
 *    <dd>
 *    If true, then only notes that are not active (i.e. notes in
 *    the Trash) will be returned. Otherwise, only active notes will be returned.
 *    There is no way to find both active and inactive notes in a single query.
 *    </dd>
 * 
 *  <dt>emphasized</dt>
 *    <dd>
 *    If present, a search query string that may or may not influence the notes
 *    to be returned, both in terms of coverage as well as of order. Think of it
 *    as a wish list, not a requirement.
 *    Accepts the full search grammar documented in the Evernote API Overview.
 *    </dd>
 *  </dl>
 */
public class NoteFilter implements TBase<NoteFilter>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("NoteFilter");

  private static final TField ORDER_FIELD_DESC = new TField("order", TType.I32, (short)1);
  private static final TField ASCENDING_FIELD_DESC = new TField("ascending", TType.BOOL, (short)2);
  private static final TField WORDS_FIELD_DESC = new TField("words", TType.STRING, (short)3);
  private static final TField NOTEBOOK_GUID_FIELD_DESC = new TField("notebookGuid", TType.STRING, (short)4);
  private static final TField TAG_GUIDS_FIELD_DESC = new TField("tagGuids", TType.LIST, (short)5);
  private static final TField TIME_ZONE_FIELD_DESC = new TField("timeZone", TType.STRING, (short)6);
  private static final TField INACTIVE_FIELD_DESC = new TField("inactive", TType.BOOL, (short)7);
  private static final TField EMPHASIZED_FIELD_DESC = new TField("emphasized", TType.STRING, (short)8);

  private int order;
  private boolean ascending;
  private String words;
  private String notebookGuid;
  private List<String> tagGuids;
  private String timeZone;
  private boolean inactive;
  private String emphasized;


  // isset id assignments
  private static final int __ORDER_ISSET_ID = 0;
  private static final int __ASCENDING_ISSET_ID = 1;
  private static final int __INACTIVE_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public NoteFilter() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NoteFilter(NoteFilter other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.order = other.order;
    this.ascending = other.ascending;
    if (other.isSetWords()) {
      this.words = other.words;
    }
    if (other.isSetNotebookGuid()) {
      this.notebookGuid = other.notebookGuid;
    }
    if (other.isSetTagGuids()) {
      List<String> __this__tagGuids = new ArrayList<String>();
      for (String other_element : other.tagGuids) {
        __this__tagGuids.add(other_element);
      }
      this.tagGuids = __this__tagGuids;
    }
    if (other.isSetTimeZone()) {
      this.timeZone = other.timeZone;
    }
    this.inactive = other.inactive;
    if (other.isSetEmphasized()) {
      this.emphasized = other.emphasized;
    }
  }

  public NoteFilter deepCopy() {
    return new NoteFilter(this);
  }

  public void clear() {
    setOrderIsSet(false);
    this.order = 0;
    setAscendingIsSet(false);
    this.ascending = false;
    this.words = null;
    this.notebookGuid = null;
    this.tagGuids = null;
    this.timeZone = null;
    setInactiveIsSet(false);
    this.inactive = false;
    this.emphasized = null;
  }

  public int getOrder() {
    return this.order;
  }

  public void setOrder(int order) {
    this.order = order;
    setOrderIsSet(true);
  }

  public void unsetOrder() {
    __isset_vector[__ORDER_ISSET_ID] = false;
  }

  /** Returns true if field order is set (has been asigned a value) and false otherwise */
  public boolean isSetOrder() {
    return __isset_vector[__ORDER_ISSET_ID];
  }

  public void setOrderIsSet(boolean value) {
    __isset_vector[__ORDER_ISSET_ID] = value;
  }

  public boolean isAscending() {
    return this.ascending;
  }

  public void setAscending(boolean ascending) {
    this.ascending = ascending;
    setAscendingIsSet(true);
  }

  public void unsetAscending() {
    __isset_vector[__ASCENDING_ISSET_ID] = false;
  }

  /** Returns true if field ascending is set (has been asigned a value) and false otherwise */
  public boolean isSetAscending() {
    return __isset_vector[__ASCENDING_ISSET_ID];
  }

  public void setAscendingIsSet(boolean value) {
    __isset_vector[__ASCENDING_ISSET_ID] = value;
  }

  public String getWords() {
    return this.words;
  }

  public void setWords(String words) {
    this.words = words;
  }

  public void unsetWords() {
    this.words = null;
  }

  /** Returns true if field words is set (has been asigned a value) and false otherwise */
  public boolean isSetWords() {
    return this.words != null;
  }

  public void setWordsIsSet(boolean value) {
    if (!value) {
      this.words = null;
    }
  }

  public String getNotebookGuid() {
    return this.notebookGuid;
  }

  public void setNotebookGuid(String notebookGuid) {
    this.notebookGuid = notebookGuid;
  }

  public void unsetNotebookGuid() {
    this.notebookGuid = null;
  }

  /** Returns true if field notebookGuid is set (has been asigned a value) and false otherwise */
  public boolean isSetNotebookGuid() {
    return this.notebookGuid != null;
  }

  public void setNotebookGuidIsSet(boolean value) {
    if (!value) {
      this.notebookGuid = null;
    }
  }

  public int getTagGuidsSize() {
    return (this.tagGuids == null) ? 0 : this.tagGuids.size();
  }

  public java.util.Iterator<String> getTagGuidsIterator() {
    return (this.tagGuids == null) ? null : this.tagGuids.iterator();
  }

  public void addToTagGuids(String elem) {
    if (this.tagGuids == null) {
      this.tagGuids = new ArrayList<String>();
    }
    this.tagGuids.add(elem);
  }

  public List<String> getTagGuids() {
    return this.tagGuids;
  }

  public void setTagGuids(List<String> tagGuids) {
    this.tagGuids = tagGuids;
  }

  public void unsetTagGuids() {
    this.tagGuids = null;
  }

  /** Returns true if field tagGuids is set (has been asigned a value) and false otherwise */
  public boolean isSetTagGuids() {
    return this.tagGuids != null;
  }

  public void setTagGuidsIsSet(boolean value) {
    if (!value) {
      this.tagGuids = null;
    }
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public void unsetTimeZone() {
    this.timeZone = null;
  }

  /** Returns true if field timeZone is set (has been asigned a value) and false otherwise */
  public boolean isSetTimeZone() {
    return this.timeZone != null;
  }

  public void setTimeZoneIsSet(boolean value) {
    if (!value) {
      this.timeZone = null;
    }
  }

  public boolean isInactive() {
    return this.inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
    setInactiveIsSet(true);
  }

  public void unsetInactive() {
    __isset_vector[__INACTIVE_ISSET_ID] = false;
  }

  /** Returns true if field inactive is set (has been asigned a value) and false otherwise */
  public boolean isSetInactive() {
    return __isset_vector[__INACTIVE_ISSET_ID];
  }

  public void setInactiveIsSet(boolean value) {
    __isset_vector[__INACTIVE_ISSET_ID] = value;
  }

  public String getEmphasized() {
    return this.emphasized;
  }

  public void setEmphasized(String emphasized) {
    this.emphasized = emphasized;
  }

  public void unsetEmphasized() {
    this.emphasized = null;
  }

  /** Returns true if field emphasized is set (has been asigned a value) and false otherwise */
  public boolean isSetEmphasized() {
    return this.emphasized != null;
  }

  public void setEmphasizedIsSet(boolean value) {
    if (!value) {
      this.emphasized = null;
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NoteFilter)
      return this.equals((NoteFilter)that);
    return false;
  }

  public boolean equals(NoteFilter that) {
    if (that == null)
      return false;

    boolean this_present_order = true && this.isSetOrder();
    boolean that_present_order = true && that.isSetOrder();
    if (this_present_order || that_present_order) {
      if (!(this_present_order && that_present_order))
        return false;
      if (this.order != that.order)
        return false;
    }

    boolean this_present_ascending = true && this.isSetAscending();
    boolean that_present_ascending = true && that.isSetAscending();
    if (this_present_ascending || that_present_ascending) {
      if (!(this_present_ascending && that_present_ascending))
        return false;
      if (this.ascending != that.ascending)
        return false;
    }

    boolean this_present_words = true && this.isSetWords();
    boolean that_present_words = true && that.isSetWords();
    if (this_present_words || that_present_words) {
      if (!(this_present_words && that_present_words))
        return false;
      if (!this.words.equals(that.words))
        return false;
    }

    boolean this_present_notebookGuid = true && this.isSetNotebookGuid();
    boolean that_present_notebookGuid = true && that.isSetNotebookGuid();
    if (this_present_notebookGuid || that_present_notebookGuid) {
      if (!(this_present_notebookGuid && that_present_notebookGuid))
        return false;
      if (!this.notebookGuid.equals(that.notebookGuid))
        return false;
    }

    boolean this_present_tagGuids = true && this.isSetTagGuids();
    boolean that_present_tagGuids = true && that.isSetTagGuids();
    if (this_present_tagGuids || that_present_tagGuids) {
      if (!(this_present_tagGuids && that_present_tagGuids))
        return false;
      if (!this.tagGuids.equals(that.tagGuids))
        return false;
    }

    boolean this_present_timeZone = true && this.isSetTimeZone();
    boolean that_present_timeZone = true && that.isSetTimeZone();
    if (this_present_timeZone || that_present_timeZone) {
      if (!(this_present_timeZone && that_present_timeZone))
        return false;
      if (!this.timeZone.equals(that.timeZone))
        return false;
    }

    boolean this_present_inactive = true && this.isSetInactive();
    boolean that_present_inactive = true && that.isSetInactive();
    if (this_present_inactive || that_present_inactive) {
      if (!(this_present_inactive && that_present_inactive))
        return false;
      if (this.inactive != that.inactive)
        return false;
    }

    boolean this_present_emphasized = true && this.isSetEmphasized();
    boolean that_present_emphasized = true && that.isSetEmphasized();
    if (this_present_emphasized || that_present_emphasized) {
      if (!(this_present_emphasized && that_present_emphasized))
        return false;
      if (!this.emphasized.equals(that.emphasized))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(NoteFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NoteFilter typedOther = (NoteFilter)other;

    lastComparison = Boolean.valueOf(isSetOrder()).compareTo(typedOther.isSetOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrder()) {      lastComparison = TBaseHelper.compareTo(this.order, typedOther.order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAscending()).compareTo(typedOther.isSetAscending());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAscending()) {      lastComparison = TBaseHelper.compareTo(this.ascending, typedOther.ascending);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWords()).compareTo(typedOther.isSetWords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWords()) {      lastComparison = TBaseHelper.compareTo(this.words, typedOther.words);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotebookGuid()).compareTo(typedOther.isSetNotebookGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotebookGuid()) {      lastComparison = TBaseHelper.compareTo(this.notebookGuid, typedOther.notebookGuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTagGuids()).compareTo(typedOther.isSetTagGuids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagGuids()) {      lastComparison = TBaseHelper.compareTo(this.tagGuids, typedOther.tagGuids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeZone()).compareTo(typedOther.isSetTimeZone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeZone()) {      lastComparison = TBaseHelper.compareTo(this.timeZone, typedOther.timeZone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInactive()).compareTo(typedOther.isSetInactive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInactive()) {      lastComparison = TBaseHelper.compareTo(this.inactive, typedOther.inactive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmphasized()).compareTo(typedOther.isSetEmphasized());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmphasized()) {      lastComparison = TBaseHelper.compareTo(this.emphasized, typedOther.emphasized);
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
        case 1: // ORDER
          if (field.type == TType.I32) {
            this.order = iprot.readI32();
            setOrderIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ASCENDING
          if (field.type == TType.BOOL) {
            this.ascending = iprot.readBool();
            setAscendingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // WORDS
          if (field.type == TType.STRING) {
            this.words = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NOTEBOOK_GUID
          if (field.type == TType.STRING) {
            this.notebookGuid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TAG_GUIDS
          if (field.type == TType.LIST) {
            {
              TList _list44 = iprot.readListBegin();
              this.tagGuids = new ArrayList<String>(_list44.size);
              for (int _i45 = 0; _i45 < _list44.size; ++_i45)
              {
                String _elem46;
                _elem46 = iprot.readString();
                this.tagGuids.add(_elem46);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // TIME_ZONE
          if (field.type == TType.STRING) {
            this.timeZone = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // INACTIVE
          if (field.type == TType.BOOL) {
            this.inactive = iprot.readBool();
            setInactiveIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // EMPHASIZED
          if (field.type == TType.STRING) {
            this.emphasized = iprot.readString();
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
    if (isSetOrder()) {
      oprot.writeFieldBegin(ORDER_FIELD_DESC);
      oprot.writeI32(this.order);
      oprot.writeFieldEnd();
    }
    if (isSetAscending()) {
      oprot.writeFieldBegin(ASCENDING_FIELD_DESC);
      oprot.writeBool(this.ascending);
      oprot.writeFieldEnd();
    }
    if (this.words != null) {
      if (isSetWords()) {
        oprot.writeFieldBegin(WORDS_FIELD_DESC);
        oprot.writeString(this.words);
        oprot.writeFieldEnd();
      }
    }
    if (this.notebookGuid != null) {
      if (isSetNotebookGuid()) {
        oprot.writeFieldBegin(NOTEBOOK_GUID_FIELD_DESC);
        oprot.writeString(this.notebookGuid);
        oprot.writeFieldEnd();
      }
    }
    if (this.tagGuids != null) {
      if (isSetTagGuids()) {
        oprot.writeFieldBegin(TAG_GUIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.tagGuids.size()));
          for (String _iter47 : this.tagGuids)
          {
            oprot.writeString(_iter47);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.timeZone != null) {
      if (isSetTimeZone()) {
        oprot.writeFieldBegin(TIME_ZONE_FIELD_DESC);
        oprot.writeString(this.timeZone);
        oprot.writeFieldEnd();
      }
    }
    if (isSetInactive()) {
      oprot.writeFieldBegin(INACTIVE_FIELD_DESC);
      oprot.writeBool(this.inactive);
      oprot.writeFieldEnd();
    }
    if (this.emphasized != null) {
      if (isSetEmphasized()) {
        oprot.writeFieldBegin(EMPHASIZED_FIELD_DESC);
        oprot.writeString(this.emphasized);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NoteFilter(");
    boolean first = true;

    if (isSetOrder()) {
      sb.append("order:");
      sb.append(this.order);
      first = false;
    }
    if (isSetAscending()) {
      if (!first) sb.append(", ");
      sb.append("ascending:");
      sb.append(this.ascending);
      first = false;
    }
    if (isSetWords()) {
      if (!first) sb.append(", ");
      sb.append("words:");
      if (this.words == null) {
        sb.append("null");
      } else {
        sb.append(this.words);
      }
      first = false;
    }
    if (isSetNotebookGuid()) {
      if (!first) sb.append(", ");
      sb.append("notebookGuid:");
      if (this.notebookGuid == null) {
        sb.append("null");
      } else {
        sb.append(this.notebookGuid);
      }
      first = false;
    }
    if (isSetTagGuids()) {
      if (!first) sb.append(", ");
      sb.append("tagGuids:");
      if (this.tagGuids == null) {
        sb.append("null");
      } else {
        sb.append(this.tagGuids);
      }
      first = false;
    }
    if (isSetTimeZone()) {
      if (!first) sb.append(", ");
      sb.append("timeZone:");
      if (this.timeZone == null) {
        sb.append("null");
      } else {
        sb.append(this.timeZone);
      }
      first = false;
    }
    if (isSetInactive()) {
      if (!first) sb.append(", ");
      sb.append("inactive:");
      sb.append(this.inactive);
      first = false;
    }
    if (isSetEmphasized()) {
      if (!first) sb.append(", ");
      sb.append("emphasized:");
      if (this.emphasized == null) {
        sb.append("null");
      } else {
        sb.append(this.emphasized);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

