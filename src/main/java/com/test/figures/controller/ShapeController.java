package com.test.figures.controller;

import com.test.figures.model.Request;
import com.test.figures.model.Shape;
import com.test.figures.util.BadRequestException;
import com.test.figures.util.ShapeCalculator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Shape area/perimeter calculator", produces = "application/json", consumes = "application/json")
@RequestMapping(value = "/shape")
public class ShapeController {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = Shape.class),
            @ApiResponse(code = 400, message = "Bad request")
    })
    @ApiOperation(value = "Returns calculated area and perimeter values")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> calculate(@RequestBody() Request request) {
        Shape shape;
        try {
            shape = ShapeCalculator.calculateShape(request);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok(shape);
    }
}


