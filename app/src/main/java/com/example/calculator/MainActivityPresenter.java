package com.example.calculator;

public class MainActivityPresenter implements MainActivityContract.IComputationListener {
    private MainActivity model;

    private MainActivityContract gui;

    public MainActivityPresenter(MainActivity model, MainActivityContract gui) {
        this.model = model;
        this.gui = gui;
    }


    @Override
    public void onAdd() {
        double result = model.add(gui.getVal1(), gui.getVal2());
        gui.updateDisplay(result);
    }

    @Override
    public void onMul() {
        double result = model.mul(gui.getVal1(), gui.getVal2());
        gui.updateDisplay(result);
    }

    @Override
    public void onDiv() {
        double result = model.div(gui.getVal1(), gui.getVal2());
        gui.updateDisplay(result);
    }

    @Override
    public void onSub() {
        double result = model.sub(gui.getVal1(), gui.getVal2());
        gui.updateDisplay(result);
    }
}
