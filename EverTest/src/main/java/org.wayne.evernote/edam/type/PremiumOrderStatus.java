/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.type;


import com.evernote.thrift.TEnum;

/**
 * This enumeration defines the possible states of a premium account
 * 
 * NONE:    the user has never attempted to become a premium subscriber
 * 
 * PENDING: the user has requested a premium account but their charge has not
 *   been confirmed
 * 
 * ACTIVE:  the user has been charged and their premium account is in good
 *  standing
 * 
 * FAILED:  the system attempted to charge the was denied. Their premium
 *   privileges have been revoked. We will periodically attempt to re-validate
 *   their order.
 * 
 * CANCELLATION_PENDING: the user has requested that no further charges be made
 *   but the current account is still active.
 * 
 * CANCELED: the premium account was canceled either because of failure to pay
 *   or user cancelation. No more attempts will be made to activate the account.
 */
public enum PremiumOrderStatus implements TEnum {
  NONE(0),
  PENDING(1),
  ACTIVE(2),
  FAILED(3),
  CANCELLATION_PENDING(4),
  CANCELED(5);

  private final int value;

  private PremiumOrderStatus(int value) {
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
  public static PremiumOrderStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return PENDING;
      case 2:
        return ACTIVE;
      case 3:
        return FAILED;
      case 4:
        return CANCELLATION_PENDING;
      case 5:
        return CANCELED;
      default:
        return null;
    }
  }
}
