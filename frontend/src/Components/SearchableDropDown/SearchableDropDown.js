import React, { useEffect, useState } from "react";
import axios from "axios";
import { Autocomplete, Box, TextField } from "@mui/material";
function SearchableDropDown(props) {
  const prop_name = props.prop_name;
  const url = props.url;
  const prop_id = props.prop_id;
  const [data, setData] = useState([]);
  const [searchWord, setsearchWord] = useState("");
  useEffect(() => {
    axios.get(url).then((res) => {
      const mydata = res.data;
      setData(mydata);
    });
  }, []);
  useEffect(() => {
    const delayDebounceFn = setTimeout(() => {
      axios.get(url + "/" + searchWord).then((res) => {
        setData(res.data);
      });
    }, 10);
    return () => clearTimeout(delayDebounceFn);
  }, [searchWord, url]);
  return (
    <React.Fragment>
      <Autocomplete
        sx={{ width: 300 }}
        options={data}
        autoHighlight
        multiple={props.isMulti}
        onChange={(event, value) => {
          props.onChange(value);
        }}
        onInputChange={(event, newValue) => {
          setsearchWord(newValue);
        }}
        getOptionLabel={(option) => option[prop_name]}
        isOptionEqualToValue={(option, value) =>
          option[prop_id] === value[prop_id]
        }
        renderOption={(props, option) => (
          <Box component="li" {...props}>
            {option[prop_name]}
          </Box>
        )}
        renderInput={(params) => (
          <TextField
            {...params}
            label={props.label}
            inputProps={{
              ...params.inputProps,
            }}
          />
        )}
      />
    </React.Fragment>
  );
}

export default SearchableDropDown;
