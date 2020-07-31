package com.example.calculator;

public interface MainActivityContract {
    void updateDisplay(double value);
    double getVal1();
    double getVal2();

    void click(IComputationListener listener);

    interface IComputationListener {
            void onAdd();
            void onSub();
            void onMul();
            void onDiv();

        }

    }

