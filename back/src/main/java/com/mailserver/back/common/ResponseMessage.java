package com.mailserver.back.common;

public interface ResponseMessage {
  String SUCCESS = "success.";
  String VALIDATION_FAIL = "Validation failed";
  String DUPLICATE_ID = "Duplicate Id";

  String SIGN_IN_FAIL = "Login information mismatch";
  String CERIFICATION_FAIL = "Certification failed";

  String DATABASE_ERROR = "Database error";
}
