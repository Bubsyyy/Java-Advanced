package _04_Abstraction.militaryElite;

import java.util.Collection;

public interface LieutenantGeneral {

    void addPrivate(Private priv);

    Collection<Private> getPrivates();
}