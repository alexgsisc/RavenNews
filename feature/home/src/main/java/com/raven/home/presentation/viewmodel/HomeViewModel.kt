package com.raven.home.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.raven.core.extensionFunctions.logError
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(){
    init {
        logError("Start view model home")
    }
}
