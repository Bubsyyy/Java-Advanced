package _04_Interfaces_And_Abstraction.militaryElite;

import java.util.ArrayList;

public interface LieutenantGeneral {
    void addPrivate(Private priv);
    ArrayList<Private> getPrivates();
}