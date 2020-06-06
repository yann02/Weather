package com.wjx.android.weather.module.chooseplace.repository

import androidx.lifecycle.MutableLiveData
import com.wjx.android.weather.base.repository.ApiRepository
import com.wjx.android.weather.common.state.State

/**
 * Created with Android Studio.
 * Description:
 * @author: Wangjianxian
 * @CreateDate: 2020/6/4 20:22
 */
class ChoosePlaceRepository(var loadState: MutableLiveData<State>) : ApiRepository() {

}