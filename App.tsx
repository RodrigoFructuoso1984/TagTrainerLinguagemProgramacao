/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { Fragment } from 'react';
import { SafeAreaView,StatusBar,Text,View } from 'react-native';

import Button from './src/components/Button';

function App(): JSX.Element {

  return (
    <Fragment>
        <StatusBar barStyle="dark-content"></StatusBar>
        <SafeAreaView>
          <Button>
            <Text>Button2</Text>
          </Button>
          <Button alerta="testou">
            <Text>Button2</Text>
          </Button>
        </SafeAreaView>
    </Fragment>
  );
}

export default App;
