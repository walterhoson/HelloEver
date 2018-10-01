/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.type;


import com.evernote.thrift.TEnum;

/**
 * Enumeration of the roles that a User can have within a sponsored group.
 * 
 * GROUP_MEMBER: The user is a member of the group with no special privileges.
 * 
 * GROUP_ADMIN: The user is an administrator within the group.
 * 
 * GROUP_OWNER: The user is the owner of the group.
 */
public enum SponsoredGroupRole implements TEnum {
  GROUP_MEMBER(1),
  GROUP_ADMIN(2),
  GROUP_OWNER(3);

  private final int value;

  private SponsoredGroupRole(int value) {
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
  public static SponsoredGroupRole findByValue(int value) { 
    switch (value) {
      case 1:
        return GROUP_MEMBER;
      case 2:
        return GROUP_ADMIN;
      case 3:
        return GROUP_OWNER;
      default:
        return null;
    }
  }
}
