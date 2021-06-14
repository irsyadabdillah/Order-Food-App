package com.irzstudio.foodapp.di

import com.irzstudio.foodapp.data.DummyDataSource
import com.irzstudio.foodapp.ui.product.ProductActivity
import com.irzstudio.foodapp.ui.product.ProductViewModel
import com.irzstudio.foodapp.ui.shop.ShopViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ShopViewModel(DummyDataSource()) }
    viewModel { ProductViewModel(DummyDataSource()) }
}