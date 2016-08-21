/*
 * ShootOFF - Software for Laser Dry Fire Training
 * Copyright (C) 2016 phrack
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.shootoff.gui;

import com.shootoff.config.Configuration;
import com.shootoff.plugins.TrainingExercise;
import com.shootoff.plugins.engine.PluginEngine;

public interface ExerciseListener {
	public void setProjectorExercise(TrainingExercise exercise);
	public void setExercise(TrainingExercise exercise);
	public Configuration getConfiguration();
	public PluginEngine getPluginEngine();
}
