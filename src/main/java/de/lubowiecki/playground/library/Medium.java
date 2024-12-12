package de.lubowiecki.playground.library;

import java.io.Serializable;

public interface Medium extends Serializable {

    // Alle Methoden im Interface sind automatisch public
    String getInfoShort();

    String getInfoFull();
}
