package _04_Abstraction.militaryElite;

import java.util.ArrayList;

public interface LieutenantGeneral {
    void addPrivate(Private priv);
    ArrayList<Private> getPrivates();
}