/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { Fragment, Component } from 'react';
import { Alert, SafeAreaView, StatusBar, Text, TextInput, TouchableOpacity, View } from 'react-native';

import Button from './src/components/Button';

export default class App extends Component {
  state = {
      contador: 0,
      name: ""
  };

  apertou = () => {
    this.setState({contador: this.state.contador+1})
  };

  mudouNome = nome => {
    this.setState({name: nome});
  };

  render() {
    return (
      <Fragment>
          <StatusBar barStyle="dark-content"></StatusBar>
          <SafeAreaView>
            <Text>Hello {this.state.name}</Text>
            <Text>Contador: {this.state.contador}</Text>
            <TextInput 
              value={this.state.name} 
              onChangeText = {nome => this.mudouNome(nome)}
            />
            <TouchableOpacity onPress={this.apertou}>
              <Text>Somar</Text>
            </TouchableOpacity>  
          </SafeAreaView>
      </Fragment>
    );
  }
}
