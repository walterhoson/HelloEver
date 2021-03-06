/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;


import com.evernote.thrift.TEnum;

/**
 * Every search query is specified as a sequence of characters.
 * Currently, only the USER query format is supported.
 */
public enum QueryFormat implements TEnum {
  USER(1),
  SEXP(2);

  private final int value;

  private QueryFormat(int value) {
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
  public static QueryFormat findByValue(int value) { 
    switch (value) {
      case 1:
        return USER;
      case 2:
        return SEXP;
      default:
        return null;
    }
  }
}
