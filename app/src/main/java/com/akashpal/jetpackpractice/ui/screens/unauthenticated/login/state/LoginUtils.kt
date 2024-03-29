package com.akashpal.jetpackpractice.ui.screens.unauthenticated.login.state

import com.akashpal.jetpackpractice.R
import com.akashpal.jetpackpractice.ui.common.state.ErrorState

val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)