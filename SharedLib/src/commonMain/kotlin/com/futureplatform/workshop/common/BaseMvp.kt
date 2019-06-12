package com.futureplatform.workshop.common

interface BaseView

abstract class BasePresenter<ViewType : BaseView> {
    protected var view: ViewType? = null

    /**
     * Used to attach the view to this presenter. It triggers [onViewTaken].
     */
    fun takeView(view: ViewType) {
        this.view = view
        onViewTaken()
    }

    /**
     * Used to remove the view to this presenter. It triggers [onViewDrop], where running jobs
     * should be canceled and objects should be de-initialised if needed.
     */
    fun dropView() {
        onViewDrop()
        this.view = null
    }

    /**
     * Called when a view is attached to this [BasePresenter].
     */
    open fun onViewTaken() {}

    /**
     * Called when a view is dropped from this [BasePresenter].
     */
    open fun onViewDrop() {}
}
