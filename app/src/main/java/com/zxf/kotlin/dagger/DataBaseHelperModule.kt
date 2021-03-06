package com.zxf.kotlin.dagger

import com.zxf.kotlin.help.DataBaseHelper
import dagger.Module
import dagger.Provides

/**
 * @Module 标注在类上，告诉component,从该类中获取依赖对象（相当于工厂，生成各种类）
 * @Provides 标记在方法上，通过这个方法可以获取依赖对象的实例（生成对应类的实例）
 */
@Module
open class DataBaseHelperModule {
    @ApplicationScope
    @Provides
    open fun ProvideDatabaseHelper(): DataBaseHelper {
        return DataBaseHelper()
    }
}