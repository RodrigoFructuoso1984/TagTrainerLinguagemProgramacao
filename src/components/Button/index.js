import React, { Component } from 'react';
import { Text,View, TouchableOpacity, Alert } from 'react-native';

/*
const Button = () => {

  return (
    <View>
        <Text>Button</Text>
    </View>
  );
}

export default Button;
*/

export default class Button extends Component {
    render() {
        return (
            <TouchableOpacity onPress={ ()  =>  {
                    Alert.alert(this.props.alerta);
                }}
            >
                <View>
                    {this.props.children}
                </View>
            </TouchableOpacity>
        )
    }
}