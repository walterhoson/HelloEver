/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wayne.evernote.edam.type;

/**
 * Contains constant values specified by this package.
 */
public class Constants {

  /**
   * A value for the "recipe" key in the "classifications" map in NoteAttributes
   * that indicates the user has classified a note as being a non-recipe.
   */
  public static final String CLASSIFICATION_RECIPE_USER_NON_RECIPE = "000";

  /**
   * A value for the "recipe" key in the "classifications" map in NoteAttributes
   * that indicates the user has classified a note as being a recipe.
   */
  public static final String CLASSIFICATION_RECIPE_USER_RECIPE = "001";

  /**
   * A value for the "recipe" key in the "classifications" map in NoteAttributes
   * that indicates the Evernote service has classified a note as being a recipe.
   */
  public static final String CLASSIFICATION_RECIPE_SERVICE_RECIPE = "002";

  /**
   * Standardized value for the 'source' NoteAttribute for notes that
   * were clipped from the web in some manner.
   */
  public static final String EDAM_NOTE_SOURCE_WEB_CLIP = "web.clip";

  /**
   * Standardized value for the 'source' NoteAttribute for notes that
   * were clipped from an email message.
   */
  public static final String EDAM_NOTE_SOURCE_MAIL_CLIP = "mail.clip";

  /**
   * Standardized value for the 'source' NoteAttribute for notes that
   * were created via email sent to Evernote's email interface.
   */
  public static final String EDAM_NOTE_SOURCE_MAIL_SMTP_GATEWAY = "mail.smtp";

}
