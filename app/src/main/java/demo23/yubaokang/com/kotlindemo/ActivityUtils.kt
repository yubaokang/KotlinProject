//package demo23.yubaokang.com.kotlindemo
//
//import android.app.Activity
//import java.util.*
//
///**
// * activity 管理工具类
// * update ybk 2017.6.2
// */
//class ActivityUtils {
//    private var activityStack: Stack<Activity>? = null
//
//    /**
//     * 获取activityStack
//     * @return
//     */
//    private fun getActivityStack(): Stack<Activity> {
//        if (activityStack == null) {
//            activityStack = Stack<Activity>()
//        }
//        return activityStack
//    }
//
//    /**
//     * 添加
//     * @param activity
//     */
//    fun addActivity(activity: Activity) {
//        getActivityStack().add(activity)
//    }
//
//    /**
//     * 移除
//     * @param activity
//     */
//    fun remove(activity: Activity) {
//        getActivityStack().remove(activity)
//    }
//
//    /**
//     * 关闭指定界面
//     * @param activity 要关闭的Activity
//     */
//    fun finish(activity: Activity?) {
//        if (activity != null) {
//            activity.finish()
//            getActivityStack().remove(activity)
//        }
//    }
//
//    /**
//     * 关闭指定界面
//     * @param clz 要关闭的Activity.class
//     */
//    fun finish(clz: Class<out Activity>) {
//        finish(getActivity(clz))
//    }
//
//    fun finishAll() {
//        while (getActivityStack().size > 0) {
//            finish(getActivityStack().peek())
//        }
//    }
//
//    /**
//     * 结束其他Activity
//     * @param clz 当前Activity.class 不需要finish
//     */
//    fun finishOthers(clz: Class<out Activity>) {
//        val activity = getActivity(clz)
//        finishOthers(activity)
//    }
//
//    /**
//     * 结束其他Activity
//     * @param activity 当前Activity 不需要finish
//     */
//    fun finishOthers(activity: Activity) {
//        for (a in getActivityStack()) {
//            if (activity !== a && a != null) {
//                a.finish()
//            }
//        }
//        getActivityStack().clear()
//        getActivityStack().add(activity)
//    }
//
//    /**
//     * 根据className 获取Activity对象
//     * @param clz Class
//     * *
//     * @return
//     */
//    private fun getActivity(clz: Class<out Activity>): Activity? {
//        for (activity in getActivityStack()) {
//            if (activity != null && activity.javaClass == clz) {
//                return activity
//            }
//        }
//        return null
//    }
//
//    /**
//     * 回退到指定的Activity.class
//     * @param clz Activity.class
//     */
//    fun backTo(clz: Class<out Activity>) {
//        if (getActivityStack().size > 0) {
//            var activity: Activity? = getActivityStack().peek()
//            while (activity != null && clz != activity.javaClass) {
//                activity.finish()
//                getActivityStack().remove(activity)
//                if (getActivityStack().size > 0) {
//                    activity = getActivityStack().peek()
//                }
//            }
//        }
//    }
//
//    companion object {
//        private var activityUtils: ActivityUtils? = null
//
//        fun get(): ActivityUtils {
//            if (activityUtils == null) {
//                synchronized(ActivityUtils::class.java) {
//                    if (activityUtils == null) {
//                        activityUtils = ActivityUtils()
//                    }
//                }
//            }
//            return activityUtils
//        }
//    }
//}
