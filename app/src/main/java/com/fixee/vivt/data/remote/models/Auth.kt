package com.fixee.vivt.data.remote.models

data class Auth(val status: String, val token: String, val userStatus: String, val error: List<Error>)