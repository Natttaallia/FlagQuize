package com.example.flagquize;

import android.os.Bundle;
import android.preference.PreferenceFragment;
public class SettingsActivityFragment extends PreferenceFragment {
    // Создание GUI настроек по файлу preferences.xml из res/xml
   @Override
   public void onCreate(Bundle bundle) {
       super.onCreate(bundle);
       addPreferencesFromResource(R.xml.preferences); // Загрузить из XML
   }
}

