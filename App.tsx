/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { Fragment } from "react";
import { SafeAreaView, Text, StatusBar, Button, Alert } from "react-native";

const App =  ({ navigation })  => {
  return (
    
    <Fragment>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <Text>App</Text>
        <Button title="Sobre" onPress={() => navigation.navigate("Sobre")} />
      </SafeAreaView>
    </Fragment>
  );
};

export default App;