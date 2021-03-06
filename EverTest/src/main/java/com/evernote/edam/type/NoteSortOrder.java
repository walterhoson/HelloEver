/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;


import com.evernote.thrift.TEnum;

/**
 * This enumeration defines the possible sort ordering for notes when
 * they are returned from a search result.
 */
public enum NoteSortOrder implements TEnum {
  CREATED(1),
  UPDATED(2),
  RELEVANCE(3),
  UPDATE_SEQUENCE_NUMBER(4),
  TITLE(5);

  private final int value;

  private NoteSortOrder(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NoteSortOrder findByValue(int value) { 
    switch (value) {
      case 1:
        return CREATED;
      case 2:
        return UPDATED;
      case 3:
        return RELEVANCE;
      case 4:
        return UPDATE_SEQUENCE_NUMBER;
      case 5:
        return TITLE;
      default:
        return null;
    }
  }
}
