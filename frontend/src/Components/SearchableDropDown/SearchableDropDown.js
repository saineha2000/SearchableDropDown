import TextField from "@mui/material/TextField";
import React, { useEffect, useState } from "react";
import Service1 from "../services/Service1";
import { Autocomplete, Box, Grid } from "@mui/material";
function DropDown() {
  const [data, setData] = useState([]);
  const [searchWord, setsearchWord] = useState("");
  useEffect(() => {
    Service1.getConData().then((res) => {
      const mydata = res.data;
      setData(mydata);
    });
  }, []);

  useEffect(() => {
    const delayDebounceFn = setTimeout(() => {
      Service1.getCountryData(searchWord).then((res) => {
        setData(res.data);
      });
    }, 10);
    return () => clearTimeout(delayDebounceFn);
  }, [searchWord]);
  return (
    <Grid sx={{ margin: 5 }}>
      <Autocomplete
        id="country-select-demo"
        sx={{ width: 300 }}
        options={data}
        autoHighlight
         onChange={(event,value)=>{console.log(value)}}
        onInputChange={(event, newValue) => {
          setsearchWord(newValue);
        }}
        getOptionLabel={(option) => option.name}
        isOptionEqualToValue={(option, value) => option.id === value.id}
        renderOption={(props, option) => (
          <Box component="li" {...props}>
            {option.name}
          </Box>
        )}
        renderInput={(params) => (
          <TextField
            {...params}
            label="country"
            inputProps={{
              ...params.inputProps,
              autoComplete: "new-password",
            }}
          />
        )}
      />
    </Grid>
  );
}

export default DropDown;
