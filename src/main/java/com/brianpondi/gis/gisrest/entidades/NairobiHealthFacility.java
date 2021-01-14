package com.brianpondi.gis.gisrest.entidades;

import javax.persistence.*;
import java.io.Serializable;
import org.locationtech.jts.geom.Point;

@Entity
@Table (name = "nairobi_health_facilities")
public class NairobiHealthFacility implements Serializable {

    private static final long SERIALVERSIONUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private Point geom;


    public static long getSERIALVERSIONUID() {
        return SERIALVERSIONUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getGeom() {
        return geom;
    }

    public void setGeom(Point geom) {
        this.geom = geom;
    }
}

/*
* [
  {
    "id": 7,
    "name": "Polygon",
    "geometry": {
      "type": "LineString",
      "coordinates": [
        [
          5,
          5
        ],
        [
          9,
          5
        ],
        [
          9,
          9
        ],
        [
          5,
          9
        ],
        [
          5,
          5
        ]
      ]
    }
  },
  ,
  ,
  {
    "id": 3,
    "name": "Polygon",
    "geometry": {
      "type": "Polygon",
      "coordinates": [
        [
          [
            0,
            0
          ],
          [
            4,
            0
          ],
          [
            4,
            4
          ],
          [
            0,
            4
          ],
          [
            0,
            0
          ]
        ]
      ]
    }
  },
  {
    "id": 10,
    "name": "Point",
    "geometry": {
      "type": "Point",
      "coordinates": [
        3,
        5
      ]
    }
  },
  {
    "id": 11,
    "name": "Point",
    "geometry": {
      "type": "Point",
      "coordinates": [
        8,
        15
      ]
    }
  },
  {
    "id": 12,
    "name": "Point",
    "geometry": {
      "type": "Point",
      "coordinates": [
        21,
        15
      ]
    }
  },
  {
    "id": 13,
    "name": "Linestring",
    "geometry": {
      "type": "LineString",
      "coordinates": [
        [
          15,
          15
        ],
        [
          16,
          16
        ],
        [
          17,
          16
        ],
        [
          17,
          17
        ]
      ]
    }
  },
  {
    "id": 4,
    "name": "GeometryCollection",
    "geometry": {
      "type": "GeometryCollection",
      "geometries": [
        {
          "type": "Point",
          "coordinates": [
            2,
            3
          ]
        },
        {
          "type": "LineString",
          "coordinates": [
            [
              2,
              3
            ],
            [
              3,
              4
            ]
          ]
        }
      ]
    }
  },
  {
    "id": 5,
    "name": "GeometryCollection",
    "geometry": {
      "type": "GeometryCollection",
      "geometries": [
        {
          "type": "Point",
          "coordinates": [
            2,
            3
          ]
        },
        {
          "type": "LineString",
          "coordinates": [
            [
              2,
              3
            ],
            [
              3,
              4
            ]
          ]
        },

      ]
    }
  },
  {
    "id": 18,
    "name": "GeometryCollection",
    "geometry": {
      "type": "GeometryCollection",
      "geometries": [
        {
          "type": "Point",
          "coordinates": [
            2,
            3
          ]
        },
        {
          "type": "LineString",
          "coordinates": [
            [
              2,
              3
            ],
            [
              3,
              4
            ]
          ]
        }
      ]
    }
  },
  {
    "id": 26,
    "name": "GeometryCollection",
    "geometry": {
      "type": "GeometryCollection",
      "geometries": [
        {
          "type": "Point",
          "coordinates": [
            2,
            3
          ]
        },
        {
          "type": "LineString",
          "coordinates": [
            [
              2,
              3
            ],
            [
              3,
              4
            ]
          ]
        }
      ]
    }
  }
]
*
* */
