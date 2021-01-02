/*
 * This file is part of parallelpbf.
 *
 *     parallelpbf is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.wolt.osm.parallelpbf.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * OSM Node entity.
 *
 * Node is a most basic building block of the OSM database.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class Node extends OsmEntity {
    public static final int COORDINATE_PRECISION = 10000000;

    /**
     * Constructs Node setting mandatory fields.
     * @param id Required node id.
     * @param latitude Node latitude.
     * @param longitude Node longitude
     */
    public Node(final long id, final int latitude, final int longitude) {
        super(id);
        this.lat = latitude;
        this.lon = longitude;
    }

    /**
     * Node latitude.
     */
    private final int lat;

    /**
     * Node longitude.
     */
    private final int lon;
}
