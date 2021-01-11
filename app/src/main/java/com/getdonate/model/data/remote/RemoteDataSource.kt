package com.getdonate.model.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val webServices: WebServices
) : BaseDataSource() {
}