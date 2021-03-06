// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.module.inventory.components;

import org.terasology.engine.entitySystem.Component;
import org.terasology.engine.math.IntegerRange;

import java.util.Map;

public class InventoryAccessComponent implements Component {
    public Map<String, IntegerRange> input;
    public Map<String, IntegerRange> output;
}
